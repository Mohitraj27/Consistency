// Create a promise that simulates an asynchronous operation
const fetchData = new Promise((resolve, reject) => {
    setTimeout(() => {
        const success = true; 
        if (success) {
            resolve('Data fetched successfully!'); 
        } else {
            reject('Failed to fetch data.'); 
               }
    }, 2000); 
});

fetchData
    .then(result => {
        console.log(result); 
    })
    .catch(error => {
        console.error(error); 
    });
