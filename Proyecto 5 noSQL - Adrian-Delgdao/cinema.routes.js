const express = require('express');
const Cinema = require('../models/Cinema');

const cinemaRouter = express.Router();

// GET todos los cines
cinemaRouter.get('/', async (req, res) => {
    try {
        // populate rellena los datos de las peliculas en vez de solo mostrar el id
        const cinemas = await Cinema.find().populate('movies');
        return res.status(200).json(cinemas);
    } catch (err) {
        return res.status(500).json({ error: 'Error al obtener los cines', details: err.message });
    }
});

// GET cine por id
cinemaRouter.get('/:id', async (req, res) => {
    const { id } = req.params;
    try {
        const cinema = await Cinema.findById(id).populate('movies');
        if (cinema) {
            return res.status(200).json(cinema);
        } else {
            return res.status(404).json({ error: 'No cinema found by this id' });
        }
    } catch (err) {
        return res.status(500).json({ error: 'Error al buscar el cine', details: err.message });
    }
});

// POST crear un nuevo cine
cinemaRouter.post('/', async (req, res) => {
    try {
        const newCinema = new Cinema(req.body);
        const savedCinema = await newCinema.save();
        return res.status(201).json(savedCinema);
    } catch (err) {
        return res.status(400).json({ error: 'Error al crear el cine', details: err.message });
    }
});

// PUT modificar un cine por id
cinemaRouter.put('/:id', async (req, res) => {
    const { id } = req.params;
    try {
        const updatedCinema = await Cinema.findByIdAndUpdate(id, req.body, { new: true });
        if (updatedCinema) {
            return res.status(200).json(updatedCinema);
        } else {
            return res.status(404).json({ error: 'No cinema found by this id' });
        }
    } catch (err) {
        return res.status(400).json({ error: 'Error al modificar el cine', details: err.message });
    }
});

// DELETE eliminar un cine por id
cinemaRouter.delete('/:id', async (req, res) => {
    const { id } = req.params;
    try {
        const deletedCinema = await Cinema.findByIdAndDelete(id);
        if (deletedCinema) {
            return res.status(200).json({ message: 'Cine eliminado correctamente', deletedCinema });
        } else {
            return res.status(404).json({ error: 'No cinema found by this id' });
        }
    } catch (err) {
        return res.status(500).json({ error: 'Error al eliminar el cine', details: err.message });
    }
});

module.exports = cinemaRouter;
