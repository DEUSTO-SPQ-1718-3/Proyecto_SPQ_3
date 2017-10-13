import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class VentanaInicial extends JFrame {

	private JPanel contentPane;

	public VentanaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(700, 350, 530, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		this.setResizable(false);
		
		JButton btnProfesores = new JButton("PROFESORES");
		btnProfesores.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				//inicializa ventana PROFESORES
				
				
			}
		});
		btnProfesores.setBounds(75, 47, 153, 91);
		contentPane.add(btnProfesores);
		
		JButton btnCursos = new JButton("CURSOS");
		btnCursos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				//inicializa ventana CURSOS
				
				
			}
		});
		btnCursos.setBounds(294, 47, 153, 91);
		contentPane.add(btnCursos);
		
		JButton btnCuotas = new JButton("CUOTAS");
		btnCuotas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//inicializa ventana CUOTAS
				
			}
		});
		btnCuotas.setBounds(75, 176, 153, 91);
		contentPane.add(btnCuotas);
		
		JButton btnEstudiantes = new JButton("ESTUDIANTES");
		btnEstudiantes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frmEstudiantes ventanaEstudiantes = new frmEstudiantes();
				ventanaEstudiantes.setVisible(true); 					
				
			}
		});
		btnEstudiantes.setBounds(294, 176, 153, 91);
		contentPane.add(btnEstudiantes);
		
		JButton btnUsuarios = new JButton("Usuarios");
		btnUsuarios.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					//inicializa ventana USUARIOS
								
			}
		});
		btnUsuarios.setBounds(100, 305, 100, 50);
		contentPane.add(btnUsuarios);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
					System.out.println("Cerrando programa...");
					System.exit(0);			
				
			}
		});
		btnSalir.setBounds(320, 305, 100, 50);
		contentPane.add(btnSalir);
	}
}
