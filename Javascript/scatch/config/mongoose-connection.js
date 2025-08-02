const mongoose = require('mongoose');

mongoose.connect('mongodb://127.0.0.1:27017/mydb').then(() => {
    console.log('Mongoose Connected Successfully')
}).catch((error) => {
    console.error('Mongoose Connection Error:', error);
});



mongoose.exports = mongoose.connection;
