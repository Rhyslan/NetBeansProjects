import tkinter as tk
from tkinter import filedialog

# Constants
N = tk.N
S = tk.S
E = tk.E
W = tk.W



class Load(tk.Tk):
    def __init__(self, parent, *args, **kwargs):
        self.parent = parent

        btnLoad = tk.Button(self.parent, text="Load Record")
        btnLoad.grid(column=0, row=11, padx=5, pady=1.5, sticky=N + S + E + W)

    def fncLoad(self, *args, **kwargs):
        pthRecordFile = filedialog.askopenfilename(initialdir=os.getcwd(), title="Select File",
                                                   filetypes=(("Text files", "*.txt*"), ("all files", "*.*")),
                                                   initialfile="record2.txt")
        if pthRecordFile != None:
            clsGlobals.pthDataFile = pthRecordFile
        else:
            return

        filOpenedFile = open(clsGlobals.pthDataFile, "r")
        strDelimiter = ", "

        clsGlobals.masRecords = [[0 for x in range(3)] for x in
                                 range(clsGlobals.mthGetFileLength(clsGlobals.pthDataFile))]

        intRecordIndex = 0

        for x in filOpenedFile:
            x = x.replace("\n", "")
            clsGlobals.masRecords[intRecordIndex] = x.split(strDelimiter)
            intRecordIndex += 1

        filOpenedFile.close()


class AddRecord(tk.Tk):
    def __init__(self, parent, *args, **kwargs):
        self.parent = parent

        btnAddRecord = tk.Button(self.parent, text="Add Record")
        btnAddRecord.grid(column=0, row=13, padx=5, pady=1.5, sticky=N + S + E + W)


class EditRecord(tk.Tk):
    def __init__(self, parent, *args, **kwargs):
        self.parent = parent

        btnEditRecord = tk.Button(self.parent, text="Edit Record")
        btnEditRecord.grid(column=0, row=12, padx=5, pady=1.5, sticky=N + S + E + W)


class SaveFile(tk.Tk):
    def __init__(self, parent, *args, **kwargs):
        self.parent = parent

        btnSave = tk.Button(self.parent, text="Save")
        btnSave.grid(column=8, row=13, padx=5, pady=5)
