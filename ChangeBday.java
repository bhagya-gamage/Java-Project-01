import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ChangeBday extends JFrame{
    private final JButton btnCancel;

    ChangeBday(){
        setSize(600,400);
        setTitle("Add Customer Form");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);

        JLabel titleLabel=new JLabel("Invalid Birthday Change Form");
        titleLabel.setFont(new Font("",1,35));
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        add("North",titleLabel);

        btnCancel=new JButton("Cancel");
        btnCancel.setFont(new Font("",1,20));
        btnCancel.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent evt){
                dispose();
            }
        });
        add("South",btnCancel);
    }
}
