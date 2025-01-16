class Coche(var color:String,
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



    private var matricula:String = ""
        set(value) {
            require(value.length == 7){ "La matrícula debe tener 7 caracteres" }
            field = value
        }


    override fun toString(): String {
        return "color: $color, marca: $marca, modelo: $modelo, numero de caballos: $numeroCaballos, número de puertas: $numeroPuertas, matricula: $matricula"
    }
    init {
        require(marca.isNullOrBlank() ){ "marca no puede ser blanco ni vacio" }
        require(modelo.isNullOrBlank()){ "Modelo no puede ser blanco ni vacio" }
        require(color != null)
    }

}

fun main(){


}