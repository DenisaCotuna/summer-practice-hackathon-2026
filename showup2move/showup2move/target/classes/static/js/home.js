function joinEvent(eventId) {

    fetch('/joinevent', {
        method: 'POST',
        headers: {
            'Content-Type': 'application/x-www-form-urlencoded'
        },
        body: 'eventId=' + eventId
    })
    .then(() => window.location.reload());
}