package madrabbit.priority.priorityspring.service;

import lombok.RequiredArgsConstructor;
import madrabbit.priority.priorityspring.exceptions.ContentNotFoundException;
import madrabbit.priority.priorityspring.pojo.Content;
import madrabbit.priority.priorityspring.repository.ContentRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class ContentService {



    private final ContentRepository contentRepository;


    public List<Content> getAll() {
        return contentRepository.findAll();
    }

    public Content getById(Long id) {
        return unwrappedContent(contentRepository.findById(id),id);
    }

    public Content create(Content entity) {
        return contentRepository.save(entity);
    }

    public void update(Long id, Content entityDetails) {
        Content entity = unwrappedContent(contentRepository.findById(id),id);
        entity.setSolution(entity.getSolution());
        contentRepository.save(entity);
    }

    public void delete(Long id) {
        contentRepository.deleteById(id);
    }

    private Content unwrappedContent(Optional<Content> entity,Long id){
        if (entity.isPresent()) {
            return entity.get();
        } else throw new ContentNotFoundException(id);
    }
}













