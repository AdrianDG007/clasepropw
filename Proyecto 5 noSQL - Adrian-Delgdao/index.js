const express = require('express');
const { connect } = require('./src/utils/db');

connect();

const PORT = 3000;
const server = express();

// necesario para que express entienda el body en formato JSON que manda postman
server.use(express.json());

// directorio de rutas
const movieRouter  = require('./src/routes/movie.routes');
const cinemaRouter = require('./src/routes/cinema.routes');

server.use('/movies',  movieRouter);
server.use('/cinemas', cinemaRouter);

server.listen(PORT, () => {
    console.log(`Server running in http://localhost:${PORT}`);
});
