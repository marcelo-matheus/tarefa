package command;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import banco.de.dados.Model.Cadastro;

import service.CadastroService;


public class ListarCadastro implements Command {

	@Override
	public void executar(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
CadastroService cs = new CadastroService();
		
		List<Cadastro> lista = cs.carregarTodosCadastro();
		
		
        //enviar para o jsp
        request.setAttribute("lista", lista);
        
        RequestDispatcher view = 
        request.getRequestDispatcher("ListaCadastro.jsp");
        view.forward(request, response);
		

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	}

