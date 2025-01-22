class Coche(color:String,
            marca:String,
            var numeroCaballos: Int,
            var numeroPuertas: Int,
            modelo: String,
            matricula:String
            ){

    val modelo: String = modelo
        get() = field.replaceFirstChar { it.uppercase() }


    val marca: String = marca
        get()=  field.lowercase().replaceFirstChar { it.uppercase() }


    var color:String = color
        set(value) {
            require(!value.isNullOrEmpty()) { "El color no puede ser nulo" }
            field = value
        }



    var matricula:String = matricula
        set(value) {
            require(value.length == 7){ "La matrícula debe tener 7 caracteres" }
            field = value
        }


    override fun toString(): String {
        return "color: $color, marca: $marca, modelo: $modelo, numero de caballos: $numeroCaballos, número de puertas: $numeroPuertas, matricula: $matricula"
    }
    init {
        require(!marca.isNullOrBlank() ){ "marca no puede ser blanco ni vacio" }
        require(!modelo.isNullOrBlank()){ "Modelo no puede ser blanco ni vacio" }
        require(color != null) { "El color no puede ser nulo" }
        require(numeroCaballos in 70..700){"El rango de caballos no es valido"}
        require(numeroPuertas in 3..5){"El rango de puertas no es valido"}
        require(matricula.length == 7){ "La matrícula debe tener 7 caracteres" }
    }

}

fun main(){

    /*

    val coche2 = Coche("verde", "", 100, 3, "", "DEF4568")
    println(coche2)

    val coche3 = Coche("azul", "ford", 400, 7, "Focus", "GHI7898")
    println(coche3)
    val coche4 = Coche("azul", "ford", 400, 4, "Focus", "G7898")
      */
    val coche1 = Coche("Rojo", "bmv", 100, 4, "2008", "ABC1234")
    coche1.color = ""

}