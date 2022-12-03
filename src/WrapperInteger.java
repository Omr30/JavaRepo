public class WrapperInteger {

    public static void main(String[] args) {

        int intPrimitivo = 32768;
//        explicito
        Integer intObjeto = Integer.valueOf(intPrimitivo);

//        implicito
        Integer intObjeto2 = intPrimitivo;
        System.out.println("intObjeto = " + intObjeto);

        int num = intObjeto;
        System.out.println("num = " + num);

        int num2 = intObjeto.intValue();
        System.out.println("num2 = " + num2);

        String valorTvLcd = "67000";
        Integer valor = Integer.valueOf(valorTvLcd);
        System.out.println("valor = " + valor);

//      Perdida de valor si no es el rango soportado
        Short shoertObjeto = intObjeto.shortValue();
        System.out.println("shoertObjeto = " + shoertObjeto);

    }

}
