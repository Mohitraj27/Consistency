const MAX_TOKENS = 5;
const REFILL_RATE = 5000; // Milliseconds between token refills (5 seconds)

const bucket = {
    tokens: MAX_TOKENS,
    hasTokens: function () { // Checks if we have tokens available
        return this.tokens > 0;
    },
    consumeToken: function () { // Function to consume a token
        if (this.hasTokens())
            this.tokens -= 1;
    },
    releaseToken: function () { // Function to release a token
        if (this.tokens < MAX_TOKENS)
            this.tokens += 1;
    }
};

async function handleIncomingRequest(requestId) {
    if (!bucket.hasTokens()) {
        console.log('Out of tokens! Please try again later', requestId);
        return;
    }

    bucket.consumeToken();
    console.log('✅ Processing Request...', requestId);
    await waitFor(2 * 1000); // Simulate a fake wait time
    return true;
}

function waitFor(ms) {
    return new Promise(resolve => setTimeout(resolve, ms));
}

setInterval(() => {
    if (!bucket.hasTokens())
        bucket.releaseToken();
}, REFILL_RATE); // Add back tokens once every REFILL_RATE milliseconds!
