package bookingApp.services

import bookingApp.repositories.IngredientRepository
import bookingApp.repositories.entity.Ingredient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class IngredientService {

    @Autowired
    private lateinit var ingredientRepository: IngredientRepository

    fun getDataById(id: Int): Ingredient? {
        return ingredientRepository.getById(id)
    }

    fun saveToDb(data: Ingredient): Ingredient {
        return ingredientRepository.save(data)
    }
}