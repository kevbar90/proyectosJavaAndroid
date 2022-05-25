package modelo;

public class ModeloLogico {

    public ModeloLogico() {
    }
    private int indexPalabra;

    public int getIndexPalabra() {
        return indexPalabra;
    }

    public void setIndexPalabra(int indexPalabra) {
        this.indexPalabra = indexPalabra;
    }

    public String[] llenarCombo() {
        String[] palabra = new String[6];
        palabra[0] = "-";
        palabra[1] = "Hello";
        palabra[2] = "Car";
        palabra[3] = "Dog";
        palabra[4] = "Red";
        palabra[5] = "Run";

        return palabra;
    }

    public String traducirPalabra() {
        String es;
        switch (this.indexPalabra) {
            case 1:
                es = "Hola";
                break;
            case 2:
                es = "Auntomovil";
                break;
            case 3:
                es = "Perro";
                break;
            case 4:
                es = "Rojo";
                break;
            case 5:
                es = "Correr";
                break;
            case 0:
                es = "Debe elegir una palabra";
                break;
            default:
                es = "no se ha elegido una opcion";
                break;

        }
        return es;
    }

}
