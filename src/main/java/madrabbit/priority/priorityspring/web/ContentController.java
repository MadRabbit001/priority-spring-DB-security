package madrabbit.priority.priorityspring.web;


import lombok.RequiredArgsConstructor;
import madrabbit.priority.priorityspring.pojo.Content;
import madrabbit.priority.priorityspring.service.ContentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping("/")
@CrossOrigin(origins = "http://localhost:3000")
public class ContentController {




    private final ContentService contentService;

    @GetMapping
    public List<Content> getAllContents() {
        return contentService.getAll();
    }

    @GetMapping("/byId/{id}")
    public Content getContentById(@PathVariable Long id) {
        return contentService.getById(id);
    }

    @PostMapping
    public Content createContent(@RequestBody Content content) {
        return contentService.create(content);
    }

    @PutMapping("/{id}")
    public ResponseEntity<HttpStatus> updateContent(@PathVariable Long id, @RequestBody String updatedText) {

        String str = updatedText;
        str = str.substring(str.indexOf(":") + 2, str.lastIndexOf("}") -1);

            Content content = contentService.getById(id);
            content.setSolution(str);

            contentService.update(content.getId(),content);
            return new ResponseEntity<>(HttpStatus.OK);

    }

    @DeleteMapping("/{id}")
    public void deleteContent(@PathVariable Long id) {
        contentService.delete(id);
    }
}
