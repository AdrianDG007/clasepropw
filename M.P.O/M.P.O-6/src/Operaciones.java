public class Operaciones {
    public void evaluarServidor (String estado){
        //200 -> ok
        //400 -> ok pero la pagian no esta disponible
        //500 -> fail, caido
        switch (obtenercodigo(estado)){
            case 200 -> {
                System.out.println("Pagia ok");
            }
            case 400 ->{
                System.out.println("Servidor ok pagina no ok");
            }
            case  500 ->{
                System.out.println("Servidor no ok" );
            }
        }
    }
    private int obtenercodigo (String estado) {
        if (estado.equals("ok")){
            return 200;
        } else if (estado.equals("ok_faiñ")) {
            return 400;
        } else {
            return 500;
        }
        }
    }

