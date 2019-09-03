package view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import fadergs.ti.saude.No;
import fadergs.ti.saude.Protocolos;

import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.UIManager;

public class VIewTelaSaida extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
        	System.err.println(ex);
        } catch (InstantiationException ex) {
        	System.err.println(ex);
        } catch (IllegalAccessException ex) {
        	System.err.println(ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
        	System.err.println(ex);
        }
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VIewTelaSaida frame = new VIewTelaSaida();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public VIewTelaSaida() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 458, 382);
		contentPane = new JPanel();
		contentPane.setBorder(null);
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textAreaSaida = new JTextArea();
		textAreaSaida.setBackground(Color.LIGHT_GRAY);
		textAreaSaida.setEditable(false);
		textAreaSaida.setBounds(96, 67, 259, 203);
		contentPane.add(textAreaSaida);
		
		JButton btnNao = new JButton("Não");
		btnNao.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Acão quanto a escolha for não
				No.raiz = No.raiz.getNoEsquerdo();
				textAreaSaida.setText(No.raiz.getConteudo());
			}
		});
		btnNao.setBounds(96, 281, 89, 23);
		contentPane.add(btnNao);
		
		JButton btnSim = new JButton("Sim");
		btnSim.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//Acão quando a escolha for sim
				No.raiz = No.raiz.getNoDireito();
				textAreaSaida.setText(No.raiz.getConteudo());
			}
			
			
			
		});
		btnSim.setBounds(266, 281, 89, 23);
		contentPane.add(btnSim);
		
		
		
		JButton btnInserirProtocolo = new JButton("Inserir protocolo");
		btnInserirProtocolo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				No.raiz = null; // inicializa o árvore
				Protocolos.lerDados();
				textAreaSaida.setText("Leitura do protocolo realizada com sucesso");
			}
		});
		btnInserirProtocolo.setBounds(10, 22, 117, 23);
		contentPane.add(btnInserirProtocolo);
		
		JButton btnIniciar = new JButton("Iniciar");
		btnIniciar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textAreaSaida.setText(No.raiz.getConteudo());
			}
		});
		btnIniciar.setBounds(180, 22, 89, 23);
		contentPane.add(btnIniciar);
		
		
	}
}
