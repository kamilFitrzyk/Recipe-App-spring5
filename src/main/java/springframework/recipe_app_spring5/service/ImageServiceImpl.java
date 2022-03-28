package springframework.recipe_app_spring5.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;
import springframework.recipe_app_spring5.domain.Recipe;
import springframework.recipe_app_spring5.repository.RecipeRepository;

import java.io.IOException;

@Slf4j
@Component
public class ImageServiceImpl implements ImageService {

    private final RecipeRepository recipeRepository;

    public ImageServiceImpl(RecipeRepository recipeRepository) {
        this.recipeRepository = recipeRepository;
    }

    @Override
    public void saveImageFile(Long recipeId, MultipartFile file) {

        try {
            Recipe recipe = recipeRepository.findById(Long.valueOf(recipeId)).get();

            Byte[] byteObjects = new Byte[file.getBytes().length];

            int i = 0;

            for( byte b : file.getBytes()){
                byteObjects[i++] = b;
            }

            recipe.setImage(byteObjects);

            recipeRepository.save(recipe);
        } catch (IOException e) {
            log.error("Error accurred", e);

            e.printStackTrace();
        }
    }
}
