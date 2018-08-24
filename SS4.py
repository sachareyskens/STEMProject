def search(L, e):
    if L[0] == e:
        return True
    elif L[0] > e:
        return False
    else:
        return search(L[1:], e)