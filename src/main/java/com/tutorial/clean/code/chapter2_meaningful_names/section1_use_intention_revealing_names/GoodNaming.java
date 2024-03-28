package com.tutorial.clean.code.chapter2_meaningful_names.section1_use_intention_revealing_names;

import java.util.ArrayList;
import java.util.List;

public class GoodNaming {

    int elapsedTimeInDays;
    int daysSinceCreation;
    int daysSinceModification;
    int fileAgeInDays;

    public List<Cell> getFlaggedCells(Cell[] gameBoard) {
        List<Cell> flaggedCells = new ArrayList<>();
        for (Cell cell : gameBoard)
            if (cell.isFlagged())
                flaggedCells.add(cell);
        return flaggedCells;
    }
}
