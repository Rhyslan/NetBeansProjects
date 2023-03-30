import tkinter as tk
from tkinter import ttk


# Constants
N = tk.N
S = tk.S
E = tk.E
W = tk.W


class RecordIndex(tk.Tk):
    def __init__(self, parent, *args, **kwargs):
        self.parent = parent

        lblRecordIndex = tk.Label(self.parent, text="Record Index")
        lblRecordIndex.grid(column=1, row=2, padx=5, pady=5)

        n = tk.IntVar()
        cmbRecordIndex = ttk.Combobox(self.parent, textvariable=n)
        cmbRecordIndex.set('Empty')  # Set values
        cmbRecordIndex.grid(column=1, row=3, padx=5, pady=5)


class Name(tk.Tk):
    def __init__(self, parent, *args, **kwargs):
        self.parent = parent

        self.lblName = tk.Label(self.parent, text="Name")
        self.lblName.grid(column=1, row=5, padx=5, pady=5)

        self.txtName = tk.Entry(self.parent)
        self.txtName.grid(column=1, row=6, columnspan=2, padx=5, pady=5)
        self.txtName.insert(0, "Empty")  # Set default value

        self.btnNameSort = tk.Button(self.parent, text="Sort Name", command=self.fncNameSort)
        self.btnNameSort.grid(column=1, row=7, columnspan=2, padx=5, pady=5)

    def fncNameSort(self):
        # TODO: Access class from Sort.py
        print("Name Sort")


class Class(tk.Tk):
    def __init__(self, parent, *args, **kwargs):
        self.parent = parent

        self.lblClass = tk.Label(self.parent, text="Class")
        self.lblClass.grid(column=4, row=5, padx=5, pady=5)

        self.txtClass = tk.Entry(self.parent)
        self.txtClass.grid(column=4, row=6, columnspan=2, padx=5, pady=5)
        self.txtClass.insert(0, "Empty")  # Set default value

        self.btnClassSort = tk.Button(self.parent, text="Sort Class", command=self.fncClassSort)
        self.btnClassSort.grid(column=4, row=7, columnspan=2, padx=5, pady=5)

    def fncClassSort(self):
        # TODO: Access class from Sort.py
        print("Class Sort")


class Year(tk.Tk):
    def __init__(self, parent, *args, **kwargs):
        self.parent = parent

        self.lblYear = tk.Label(self.parent, text="Year")
        self.lblYear.grid(column=7, row=5, padx=5, pady=5)

        self.txtYear = tk.Entry(self.parent)
        self.txtYear.grid(column=7, row=6, columnspan=2, padx=5, pady=5)
        self.txtYear.insert(0, "Empty")  # Set default value

        self.btnYearSort = tk.Button(self.parent, text="Sort Year", command=self.fncYearSort)
        self.btnYearSort.grid(column=7, row=7, columnspan=2, padx=5, pady=5)

    def fncYearSort(self):
        # TODO: Access class from Sort.py
        print("Year Sort")
