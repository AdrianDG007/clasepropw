const express = require('express');
const Movie = require('../models/Movie');

const movieRouter = express.Router();

// GET todas las peliculas
movieRouter.get('/', async (req, res) => {
    try {
        const movies = await Movie.find();
        return res.status(200).json(movies);
    } catch (err) {
        return res.status(500).json({ error: 'Error al obtener las peliculas', details: err.message });
    }
});

// GET pelicula por id
movieRouter.get('/id/:id', async (req, res) => {
    const id = req.params.id;
    try {
        const movie = await Movie.findById(id);
        if (movie) {
            return res.status(200).json(movie);
        } else {
            return res.status(404).json({ error: 'No movie found by this id' });
        }
    } catch (err) {
        return res.status(500).json({ error: 'Error al buscar la pelicula', details: err.message });
    }
});

// GET pelicula por titulo
movieRouter.get('/title/:title', async (req, res) => {
    const { title } = req.params;
    try {
        const movieByTitle = await Movie.find({ title });
        return res.status(200).json(movieByTitle);
    } catch (err) {
        return res.status(500).json({ error: 'Error al buscar por titulo', details: err.message });
    }
});

// GET peliculas por genero
movieRouter.get('/genre/:genre', async (req, res) => {
    const { genre } = req.params;
    try {
        const movieByGenre = await Movie.find({ genre });
        return res.status(200).json(movieByGenre);
    } catch (err) {
        return res.status(500).json({ error: 'Error al buscar por genero', details: err.message });
    }
});

// GET peliculas a partir de un año
movieRouter.get('/year/:year', async (req, res) => {
    const { year } = req.params;
    try {
        const movieByYear = await Movie.find({ year: { $gt: year } });
        return res.status(200).json(movieByYear);
    } catch (err) {
        return res.status(500).json({ error: 'Error al buscar por año', details: err.message });
    }
});

// POST crear una nueva pelicula
movieRouter.post('/', async (req, res) => {
    try {
        // cojo los datos del body que manda postman
        const newMovie = new Movie(req.body);
        const savedMovie = await newMovie.save();
        return res.status(201).json(savedMovie);
    } catch (err) {
        // si falta un campo required mongoose lanza un ValidationError
        return res.status(400).json({ error: 'Error al crear la pelicula', details: err.message });
    }
});

// PUT modificar una pelicula por id
movieRouter.put('/:id', async (req, res) => {
    const { id } = req.params;
    try {
        // new:true devuelve el documento ya actualizado, si no devuelve el viejo
        const updatedMovie = await Movie.findByIdAndUpdate(id, req.body, { new: true });
        if (updatedMovie) {
            return res.status(200).json(updatedMovie);
        } else {
            return res.status(404).json({ error: 'No movie found by this id' });
        }
    } catch (err) {
        return res.status(400).json({ error: 'Error al modificar la pelicula', details: err.message });
    }
});

// DELETE eliminar una pelicula por id
movieRouter.delete('/:id', async (req, res) => {
    const { id } = req.params;
    try {
        const deletedMovie = await Movie.findByIdAndDelete(id);
        if (deletedMovie) {
            // devuelvo la pelicula eliminada para confirmar que se ha borrado bien
            return res.status(200).json({ message: 'Pelicula eliminada correctamente', deletedMovie });
        } else {
            return res.status(404).json({ error: 'No movie found by this id' });
        }
    } catch (err) {
        return res.status(500).json({ error: 'Error al eliminar la pelicula', details: err.message });
    }
});

module.exports = movieRouter;
