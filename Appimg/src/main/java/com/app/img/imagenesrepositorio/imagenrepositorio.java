package com.app.img.imagenesrepositorio;

import com.app.img.imagenes.imagen;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin
@RepositoryRestResource(path = "img", collectionResourceRel = "img")
public interface imagenrepositorio extends CrudRepository<imagen, Integer> {
}
