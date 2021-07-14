class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        minutes++;
        if (minutes > 59) {
            if (hours < 12) {
                hours++;
            } else {
                hours = 1;
            }
            minutes = 0;
        }
    }
}