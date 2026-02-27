const mongoose = require('mongoose');
const Schema = mongoose.Schema;

// nueva coleccion que pide el proyecto 5
// cada cine tiene nombre, ciudad, y un array con las peliculas que emite
const cinemaSchema = new Schema(
  {
    name:    { type: String, required: true },
    city:    { type: String, required: true },
    // guardamos los ids de las peliculas que emite ese cine
    movies:  [{ type: Schema.Types.ObjectId, ref: 'Movie' }],
  },
  {
    timestamps: true,
  }
);

const Cinema = mongoose.model('Cinema', cinemaSchema);
module.exports = Cinema;
