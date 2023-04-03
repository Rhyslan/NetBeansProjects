import tkinter as tk
from tkinter import ttk
from tkinter import filedialog
from tkinter import simpledialog
import os


# Constants
N = tk.N
S = tk.S
E = tk.E
W = tk.W


class Global:
    masRecords = [[]]
    intFileLineCount = 0
    pthDataFile = ""
    blnIsSaved = True
    intSortDirection = 0  # 0 = Ascending, 1 = Descending
    intSearchOption = 0  # 0 = Name, 1 = Class, 2 = Year

    @staticmethod
    def mth_get_file_length(pth_file):
        int_file_line_count = 0
        fil_opened_file = open(pth_file)

        for _ in fil_opened_file:
            int_file_line_count += 1

        fil_opened_file.close()

        return int_file_line_count
