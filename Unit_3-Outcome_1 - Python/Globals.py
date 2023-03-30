class Global():
    masRecords = 0
    intFileLineCount = 0
    pthDataFile = ""
    blnIsSaved = True
    intSortDirection = 0  # 0 = Ascending, 1 = Descending
    intSearchOption = 0  # 0 = Name, 1 = Class, 2 = Year

    @staticmethod
    def mthGetFileLength(pthFile):
        intFileLineCount = 0
        filOpenedFile = open(pthFile)

        for x in filOpenedFile:
            intFileLineCount += 1

        filOpenedFile.close()

        return intFileLineCount