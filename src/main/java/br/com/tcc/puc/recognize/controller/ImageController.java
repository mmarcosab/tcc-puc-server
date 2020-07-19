package br.com.tcc.puc.recognize.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.core.io.InputStreamResource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@RequiredArgsConstructor
@Controller
public class ImageController {

    private final ResourceLoader resourceLoader;

    @GetMapping("/images")
    public String index() {
        return "images";
    }

    @PostMapping("/upload-image")
    public String singleFileUpload(@RequestParam("file") MultipartFile file,RedirectAttributes redirectAttributes) {
        if (file.isEmpty()) {
            redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
            return "redirect:uploadStatus";
        }
        try {
            byte[] bytes = file.getBytes();
            Path path = Paths.get("E:/workspace-intellij/TCC/uploaded-images/" + file.getOriginalFilename());
            Files.write(path, bytes);
            redirectAttributes.addFlashAttribute("message",
                    "You successfully uploaded '" + file.getOriginalFilename() + "'");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "index";
    }

    @GetMapping( "/images-teste" )
    @ResponseBody
    public ResponseEntity<?> showImage() {
        try {
            Resource file = resourceLoader.getResource("file:E:/workspace-intellij/TCC/uploaded-images/print-valor.png");
            return ResponseEntity.ok()
                    .contentType(MediaType.IMAGE_JPEG)
                    .body(new InputStreamResource(file.getInputStream()));
        } catch (Exception e) {
            return ResponseEntity.badRequest()
                    .body("Não foi possível encontrar a imagem.");
        }
    }

}
