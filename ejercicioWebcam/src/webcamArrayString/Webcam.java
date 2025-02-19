package webcamArrayString;

/**
 * 
 * @author AdrianBaileCampos
 * @version 1.0
 * @since 2025-02-19
 */


 public class Webcam {



    /**
     * Atributos
     */
    
     private String[] resolucion;
     private int FPS;
     private boolean encendido;
     private double tamanioImagen;






    /**
     * Constructor con paso de parametros (resolucion,FPS)
     * 
     * @param resolucion La resolucion que tiene determinada la webcam
     * @param FPS El numero de FPS que tiene determinado la webcam
     */


     public Webcam(String[] resolucion, int FPS){

        this.resolucion=resolucion;
        this.FPS=FPS;
        this.encendido=false;
     }


    /**
     * Constructor sin parametros
     */

     public Webcam(){

        this.resolucion = new String[2];
        this.FPS=0;
        this.encendido=false;

        
    }







    /**
     * Getters
     */

     /**
      * Obtiene la resolucion de la webcam
      * @return resolucion actual
      */

     public String[] getResolucion(){
        return this.resolucion;
     }

     /**
      * Obtiene el numero de FPS de la webcam
      * @return FPS. La cantidad de FPS actuales
      */

     public int getFPS(){
        return this.FPS;
     }

     /**
      * Obtiene el estado encendido/apagado de la webcam
      * @return encendido. El estado actual
      */

     public boolean getEncendido(){
        return this.encendido;

     }

     /**
      * Obtiene el tamaño de la imagen tomada
      * @return tamanioImagen. El tamaño actual
      */

     public double getTamanioImagen(){
        return this.tamanioImagen;
     }

     
     /**
      * Obtiene el ancho de la resolucion
      * @return ancho. El ancho de la resolucion, en tipo numerico entero
      */

    public int getAnchoResolucion(){

        int anchoResolucion=Integer.parseInt(this.resolucion[0]);
        return anchoResolucion;
    }


      /**
      * Obtiene el alto de la resolucion
      * @return alto. El alto de la resolucion, en tipo numerico entero
      */

    public int getAltoResolucion(){

        int altoResolucion=Integer.parseInt(this.resolucion[1]);

        return altoResolucion;
        
    }


    /**
    * Setters
    */

    /**
     * Establece la resolucion de la webcam
     * @param resolucion
     */

    public void setResolucion(String[] resolucion){
        this.resolucion=resolucion;

    }

    /**
     * Establece la cantidad de FPS de la webcam
     * @param FPS
     */

    public void setFPS(int FPS){
        this.FPS=FPS;
    }

    /**
     * Establece el estado de encendido/apagado de la webcam
     * @param encendido
     */

    public void setEncendido(boolean encendido){
        this.encendido=encendido;
    }

    /**
     * Establece el tamaño de archivo de la imagen tomada por la webcam
     * @param tamanioImagen
     */

    public void setTamanioImagen(double tamanioImagen){
        this.tamanioImagen=tamanioImagen;
    }







    /**
     * Metodos
     */

    /**
     * Cambia el estado de encendido/apagado a true. Encendiendo la webcam
     */

    public void encender(){
        this.encendido=true;
    }

    /**
     * Cambia el estado de encendido/apagado a false. Apagando la webcam
     */
    
    public void apagar(){
        this.encendido=false;
    }

    /**
     * Si la webcam esta encendida, devulve un mensaje mostrando que la foto ha sido tomada con los valores de la resolucion actual
     * y el tamaño del archivo de la imagen
     * 
     * Si la webcam esta apagada, devuelve un mensaje mostrando que no se ha tomado la foto y que la camara no esta encendida
     */

    public void tomarFoto(){

    

        if(this.encendido==true){

        this.tamanioImagen=(getAnchoResolucion() * getAltoResolucion() * this.FPS) / 1000000.0;
        

        System.out.println( "La foto ha sido tomada con la resolucion de "+ this.resolucion[0] +"x"+ this.resolucion[1] +
                            " PX y con un tamaño estimado de archivo de " + this.tamanioImagen +"MB");

        }else{
            System.out.println("No se ha tomado la foto, la cámara no esta encendida");
        }
    }






    public void cambiarResolucion(){}

    public void consumoDatos(){}










    /**
     * Prueba en el 'main'
     * @param args. Argumentos de linea de comandos
     */

    public static void main(String[] args) {

        String[] resolucion={"1920", "1080"};
        

        Webcam webcam= new Webcam(resolucion, 30);
        
        webcam.tomarFoto();

        webcam.encender();

        webcam.tomarFoto();

        webcam.apagar();

        

    }
}

