package com.generation.blogpessoal.security;

import java.util.Collection;
import java.util.List;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.generation.blogpessoal.model.Usuario;

public class UserDetailsImpl implements UserDetails{
	//fala p/ segurança quais são as informações que serão utilizadas no login
	
	private static final long serialVersionUID = 1L;
	//identificador da versão da classe
	
	private String userName; //
	private String password;
	private List<GrantedAuthority> authorities; //essa classe consegue passar níveis de acesso de um usuário
	
	//passando usuario e senha informados para os atributos dessa classe
	public UserDetailsImpl(Usuario user) {
		this.userName = user.getUsuario();
		this.password = user.getSenha();
	}
	
	//metodo construtor vazio p/ garantir funcionamento da api quando nn receber dados
	public UserDetailsImpl() {
		
	}
	

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return userName;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}
	
}
