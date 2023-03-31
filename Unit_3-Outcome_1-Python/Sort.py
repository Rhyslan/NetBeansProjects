import tkinter as tk


class Sort(tk.Tk):
    def __init__(self, parent, *args, **kwargs):
        self.parent = parent

        self.lblSortDirection = tk.Label(self.parent, text="Sort Direction")
        self.lblSortDirection.grid(column=2, row=10, padx=5, pady=5)

        self.rtnSortAsc = tk.Radiobutton(self.parent, text="Asc", value=1)
        self.rtnSortAsc.grid(column=2, row=11, padx=5, pady=5)

        self.rtnSortDes = tk.Radiobutton(self.parent, text="Des", value=2)
        self.rtnSortDes.grid(column=2, row=12, padx=5, pady=5)
