package com.aurionpro.repository;

public interface UserReposoitory {

	Object findByUsernameOrEmail(String usernameOrEmail, String usernameOrEmail2);

}
