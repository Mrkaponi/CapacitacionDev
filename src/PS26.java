import javax.swing.*;

public class PS26 {

    private int n1, n2, n3;


    public void setAllValues(int n1, int n2, int n3) {
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public void maxValue() {
        int max = n1;

        if (n2 >= max) {
            max = n2;
        } else if (n3 >= max) {
            max = n3;
        }
            JOptionPane.
                showMessageDialog
                        (null
                                , "El valos mas alto es = " + max);

    }
}
