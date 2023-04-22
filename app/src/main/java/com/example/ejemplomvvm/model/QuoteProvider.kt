package com.example.ejemplomvvm.model

class QuoteProvider {
    companion object{
        fun random(): QuoteModel{
            val position =(0..9).random()
            return quotes[position]
        }
        private val quotes = listOf(
            QuoteModel(
                quote = "Soltala Erika",
                author = "Anonimo"
            ),
            QuoteModel(
                quote = "Baja la camara y entende conmigo",
                author = "Anonimo"
            ), QuoteModel(
                quote = "Jonathaaaan!!",
                author = "Anonimo"
            ),
            QuoteModel(
                quote = "El dinero alcanza cuando  nadie roba",
                author = "Nayib Bukele"
            ),
            QuoteModel(
                quote = "El salvadoreño no hizo las cosas hace un rato , las hizo dendioy",
                author = "Anonimo"
            ),
            QuoteModel(
                quote = "El salvadoreño no anda carro, anda en nave",
                author = "Anonimo"
            ),
            QuoteModel(
                quote = "El salvadoreño no entrena, le meten un gran chicharron",
                author = "Anonimo"
            ),
            QuoteModel(
                quote = "El salvadoreño no pone anteción, le pone queso",
                author = "Anonimo"
            ),
            QuoteModel(
                quote = "El salvadoreño  no molesta , chinga",
                author = "Anonimo"
            ),
            QuoteModel(
                quote = "El salvadoreño no es tacaño , es chucho",
                author = "Anonimo"
            ),
        )
    }
}