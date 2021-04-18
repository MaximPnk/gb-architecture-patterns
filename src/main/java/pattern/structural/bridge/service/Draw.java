package pattern.structural.bridge.service;

import pattern.structural.bridge.model.Figure;

public interface Draw {

    Figure createBigYellowCircle();
    Figure createSmallWhiteSquare();
}
