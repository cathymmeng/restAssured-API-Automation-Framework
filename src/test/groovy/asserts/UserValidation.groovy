package asserts

class UserValidation {

    def static isCorrect = {
        it -> it.containsKey("login") && it.containsValue("Medibank_Cathy")
    }

}