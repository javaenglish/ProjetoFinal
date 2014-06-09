package com.senac.projetoissues.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.senac.projetoissues.Usuario;

import static org.mockito.Mockito.*;

public class TesteUsuario {

	private String username;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testeCriaUsuario() {
		Usuario usuario = mock (Usuario.class);
	}
	
	@Test
	public void testeCriaUsuarioComNome() {
		Usuario usuario = mock (Usuario.class);
		assertEquals(null, usuario.getNome());
	}
	
	@Test
	
	public void testeCriaUsuarioComNomeEUserName() {
		Usuario usuario = mock (Usuario.class);
		
		assertEquals(null, usuario.getNome());
		
		assertEquals(username, usuario.getUsername());
	}

}
