package com.senac.projetoissues.teste;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.senac.projetoissues.Usuario;

import static org.mockito.Mockito.*;

public class TesteUsuario {

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
		assertEquals("nome", usuario.getNome());
	}

}
