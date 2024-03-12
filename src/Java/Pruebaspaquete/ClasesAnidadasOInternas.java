package Java.Pruebaspaquete;


class ClaseAnidadasOInternas {
    int x = 10;

    class ClaseInterna {
        int y = 5;
    }
}

class Main {
    public static void main(String[] args) {
        ClaseAnidadasOInternas myOuter = new ClaseAnidadasOInternas();
        ClaseAnidadasOInternas.ClaseInterna myInner = myOuter.new ClaseInterna();
        System.out.println(myInner.y + myOuter.x);
    }
}

// Outputs 15 (5 + 10)
