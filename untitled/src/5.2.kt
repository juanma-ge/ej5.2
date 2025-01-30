class Cliente(
    val nombre: String,
    val apellidos: String,
    val edad: Int,
    val dni: String
)

class Pedido(
    val fecha: String
) {
    fun calcularCoste(cantidad: Int, precio: Float, impuestos: Float): Float {
        return cantidad * (precio + impuestos)
    }

    fun registrarPago() {

    }
}

class Producto(
    val nombre: String,
    val descripcion: String,
    val precio: Float,
    val impuestos: Float
)

class Stock(
    val producto: String,
    var cantidad: Int
) {
    fun actualizarStock() {

    }
}

enum class Pago {
    Card, Cash, Cheque
}

enum class EstadoPedido {
    pdte, pgdo, pcdo, envdo, entgdo
}
