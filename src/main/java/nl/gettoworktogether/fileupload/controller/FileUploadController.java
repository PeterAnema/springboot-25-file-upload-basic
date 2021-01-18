package nl.gettoworktogether.fileupload.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@RestController
public class FileUploadController {

    private static final String storageLocation = "/Users/peter/NOVI/Springboot/sandbox/25 file-upload/uploaded_files/";

    @RequestMapping(value = "/file-upload", method = RequestMethod.POST)
    @ResponseBody
    public String uploadFile(@RequestParam("file") MultipartFile multipartFile) throws IOException {
        multipartFile.transferTo(new File(storageLocation + multipartFile.getOriginalFilename()));
        return "File successfully uploaded!";
    }

}
