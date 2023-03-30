# Will contain string and integer sorting algorithms

# TODO: Put following code into class and tidy up

lblSortDirection = tk.Label(win, text="Sort Direction")
lblSortDirection.grid(column=2, row=10, padx=5, pady=5)

rtnSortAsc = tk.Radiobutton(win, text="Asc", value=1)
rtnSortAsc.grid(column=2, row=11, padx=5, pady=5)

rtnSortDes = tk.Radiobutton(win, text="Des", value=2)
rtnSortDes.grid(column=2, row=12, padx=5, pady=5)
