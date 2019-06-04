package solid.liskov

class PatoDeBorracha: Pato() {

    override fun voar() {
        throw Exception("Pato de borracha não voa!")
    }
}