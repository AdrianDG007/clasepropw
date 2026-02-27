const mongoose = require('mongoose');
const Cinema = require('../models/Cinema');
const Movie  = require('../models/Movie');

// primero busco las peliculas para guardar sus ids en los cines
mongoose
  .connect('mongodb://localhost:27017/proyecto-basico-express-movies')
  .then(async () => {

    // cojo algunas peliculas para asignarlas a los cines
    const matrix      = await Movie.findOne({ title: 'The Matrix' });
    const nemo        = await Movie.findOne({ title: 'Buscando a Nemo' });
    const interestelar = await Movie.findOne({ title: 'Interestelar' });
    const dory        = await Movie.findOne({ title: 'Buscando a Dory' });

    const cinemas = [
      {
        name:   'Cines Kinépolis',
        city:   'Madrid',
        movies: [matrix?._id, interestelar?._id],
      },
      {
        name:   'Yelmo Cines',
        city:   'Barcelona',
        movies: [nemo?._id, dory?._id],
      },
      {
        name:   'Cinesa Diagonal',
        city:   'Barcelona',
        movies: [matrix?._id, nemo?._id, interestelar?._id],
      },
    ];

    const allCinemas = await Cinema.find();
    if (allCinemas.length) {
      await Cinema.collection.drop();
    }

    await Cinema.insertMany(cinemas);
    console.log('Cinemas DatabaseCreated');
  })
  .catch((err) => console.log(`Error: ${err}`))
  .finally(() => mongoose.disconnect());
