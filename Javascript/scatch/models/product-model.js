const mongoose = require('mongoose');


const productSchema = new mongoose.Schama({
    image: String,
    name: String,
    price: Number,
    discount: {
        type: Number,
        default: 0,
    },  
    bgcolor: String,
    panelcolor: String,
    textcolor: String
});
module.exports = mongoose.model('Product', productSchema);