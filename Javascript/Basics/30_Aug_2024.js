function fetchData(url, callback) {
    setTimeout(() => {
      console.log(`Fetching data from ${url}`);
      callback(null, `Data from ${url}`);
    }, 1000);
  }
  
  function processData(data, callback) {
    setTimeout(() => {
      console.log(`Processing ${data}`);
      callback(null, `Processed ${data}`);
    }, 1000);
  }
  
  function saveData(data, callback) {
    setTimeout(() => {
      console.log(`Saving ${data}`);
      callback(null, `Saved ${data}`);
    }, 1000);
  }
  
  fetchData('https://api.example.com', (err, data) => {
    if (err) {
      console.error('Error fetching data:', err);
      return;
    }
  
    processData(data, (err, processedData) => {
      if (err) {
        console.error('Error processing data:', err);
        return;
      }
  
      saveData(processedData, (err, savedData) => {
        if (err) {
          console.error('Error saving data:', err);
          return;
        }
  
        console.log('Final result:', savedData);
      });
    });
  });
  