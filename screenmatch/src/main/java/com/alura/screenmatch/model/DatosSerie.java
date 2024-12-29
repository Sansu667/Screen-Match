package com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true) // Ignorar los datos que no hemos mapeado en esta clase.

public record DatosSerie(@JsonAlias("Title") String titulo, @JsonAlias("totalSeasons") Integer totalDeTemporadas, @JsonAlias("imdbRating") String evaluacion, @JsonAlias("Poster")String poster, @JsonAlias("Genre") String genero, @JsonAlias("Actors")String actores, @JsonAlias("Plot")String sinopsis) { // Mapeo de los datos que queremos pedir a la API. Json Alias nos permite hacer que transformar lo que viene en la API a lo que pusimos en la clase.
}
