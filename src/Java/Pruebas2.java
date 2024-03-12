package Java;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Pruebas2 {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Marco1 mimarco=new Marco1();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mimarco.setVisible(true);


    }

}

class Marco1 extends JFrame{ //OBJETO MARCO

    public Marco1() {

        setTitle("Calculadora");
        setBounds(300,280,400,400);
        add(new Lamina1());
        //pack();
    }
}

class Lamina1 extends JPanel{ //OBJETO LÁMINA

    public Lamina1() {

        principio=true;//Esta variable se inicia a la vez que la lámina para indicar que la calculadora está en su estado inicial. Nos sirve para limpiar el texto inicial del display

        setLayout(new BorderLayout()); //DISPOSICIÓN

        //DESARROLLO DEL DISPLAY
        pantalla=new JButton("Calculadora megachupi"); //BOTÓN
        add(pantalla,BorderLayout.NORTH); //LUGAR DEL BOTÓN
        pantalla.setEnabled(false); //INHABILITAMOS EL BOTÓN PARA QUE FUNCIONE COMO DISPLAY

        //AHORA DESARROLLAMOS LA LÁMINA DEL TECLADO
        laminateclado=new JPanel(); //Lámina del teclado, que añadiremos al BordeLayout
        laminateclado.setLayout(new GridLayout(5,4));//Estructura interna del teclado
        add(laminateclado,BorderLayout.CENTER);//Lugar del teclado

        //INSTANCIAMOS LAS CLASES OYENTES
        ActionListener insertar=new InsertaNumero();
        ActionListener operar=new InsertaOperacion();
        //BOTONES DEL TECLADO. Introducimos las variables rótulo y oyente, según al método que queramos que se ciña el botón
        ponerboton("C",operar);
        ponerboton("√",operar);
        ponerboton("^",operar);
        ponerboton("%",operar);
        ponerboton("7",insertar);
        ponerboton("8",insertar);
        ponerboton("9",insertar);
        ponerboton("x",operar);
        ponerboton("4",insertar);
        ponerboton("5",insertar);
        ponerboton("6",insertar);
        ponerboton("+",operar);
        ponerboton("1",insertar);
        ponerboton("2",insertar);
        ponerboton("3",insertar);
        ponerboton("-",operar);
        ponerboton("0",insertar);
        ponerboton(".",operar);
        ponerboton("/",operar);
        ponerboton("=",operar);

        ultimaoperacion="=";
    }
    //Creamos un método para generar rápidamente botones en la sublámina.
    private void ponerboton (String rotulo, ActionListener oyente) { //Parámetro String para el nombre del botón (que nos servirá para operar), y el parámetro ActionListener pondrá a la escucha a las instancias creadas dentro del método

        JButton boton=new JButton(rotulo);//Instancia un botón con el String insertado en el método
        boton.addActionListener(oyente);//Ponemos a la escucha los botones. Cuando un botón es pulsado, emite un evento que será ejecutado automáticamente por el método ActionPerformed
        laminateclado.add(boton);//Se añade el botón a la lámina del teclado
        //COLOREAMOS LOS BOTONES UNO A UNO
        if(rotulo=="1") {
            boton.setBackground(Color.white);
        }
        else if(rotulo=="2") {
            boton.setBackground(Color.white);
        }
        else if(rotulo=="3") {
            boton.setBackground(Color.white);
        }
        else if(rotulo=="4") {
            boton.setBackground(Color.white);
        }
        else if(rotulo=="5") {
            boton.setBackground(Color.white);
        }
        else if(rotulo=="6") {
            boton.setBackground(Color.white);
        }
        else if(rotulo=="7") {
            boton.setBackground(Color.white);
        }
        else if(rotulo=="8") {
            boton.setBackground(Color.white);
        }
        else if(rotulo=="9") {
            boton.setBackground(Color.white);
        }
        else if(rotulo=="0") {
            boton.setBackground(Color.white);
        }
        else if(rotulo==".") {
            boton.setBackground(Color.white);
        }
        //Ponemos a la escucha los botones


    }

    private class InsertaNumero implements ActionListener{ //Esta clase contiene el método ActionPerformed, cuyas instancias son capaces de oír eventos de tipo acción(clic)y ejecutar una acción en el método ActionPerformed.

        public void actionPerformed(ActionEvent e) {//Este método se activa cada vez se pulsa un elemento a la escucha de una instancia de esta clase. La variable e es el evento externo(objeto ActionListener) almacenado

            String entrada=e.getActionCommand();//La variable entrada almacena en texto el contenido del botón pulsado

            //Herramienta para limpiar el texto inicial del display
            if(principio) {
                pantalla.setText("");
                principio=false;
            }
            pantalla.setText(pantalla.getText()+entrada);//Agregamos al botón pantalla el contenido de la variable entrada

        }

    }
    private class InsertaOperacion implements ActionListener{//Otra clase para eventos de acción, pero para las teclas de operaciones

        public void actionPerformed(ActionEvent e) {

            String operacion=e.getActionCommand();//Con este método identificamos la operación y la convertimos en variable String
            //System.out.println(operacion);
            calcular(Double.parseDouble(pantalla.getText()));//Pasamos el texto del botón a numérico usando el parseDouble
            ultimaoperacion=operacion;//almacena la última operación realizada
            principio=true;//Iniciamos la variable para activar la herramienta de limpiado del display, ubicada en la clase InsertaNumero

        }

    }

    //ESTE VA A SER EL CEREBRO DE LA CALCULADORA
    public void calcular (double x) {

        //Cadena de condicionales para especificar las operaciones
        if (ultimaoperacion.equals("+")){
            resultado+=x;
            //System.out.println(resultado);
        }
        else if (ultimaoperacion.equals("-")) {
            resultado-=x;
        }
        else if (ultimaoperacion.equals("x")) {
            resultado*=x;
        }
        else if (ultimaoperacion.equals("/")) {
            resultado/=x;
        }
        else if (ultimaoperacion.equals("√")) {
            resultado=Math.sqrt(resultado);
        }
        else if (ultimaoperacion.equals("^")) {
            resultado=Math.pow(resultado,x);
        }
        else if (ultimaoperacion.equals("%")) {
            resultado=resultado*100;
        }
        else if (ultimaoperacion.equals("C")) {
            resultado=0;
        }
        else if (ultimaoperacion.equals("=")) {
            resultado=x;
        }

        pantalla.setText(""+resultado);
    }



    private JPanel laminateclado;//Variable declarada fuera para que pueda ser usada tanto por el constructor como por los métodos
    private JButton pantalla;//Variable declarada fuera para que pueda ser usada tanto por el constructor como por los métodos
    private boolean principio;//Variable que indica el estado del display (inicial o no). Es false por defecto
    private double resultado;//Variable que almacena el resultado acumulado de las operaciones
    private String ultimaoperacion;//Variable que almacena la última operación realizada, para poder terminar cálculos

}










