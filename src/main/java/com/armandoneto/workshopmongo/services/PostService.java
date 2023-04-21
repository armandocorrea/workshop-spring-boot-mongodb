package com.armandoneto.workshopmongo.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.armandoneto.workshopmongo.domain.Post;
import com.armandoneto.workshopmongo.repository.PostRepository;
import com.armandoneto.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class PostService {

	@Autowired
	private PostRepository repo;
	
	public Post findById(String id) {
		Optional<Post> obj = repo.findById(id);

		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado."));
	}

}
