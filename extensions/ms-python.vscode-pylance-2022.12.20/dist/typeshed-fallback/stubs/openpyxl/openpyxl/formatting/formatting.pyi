from typing import Any

from openpyxl.descriptors.serialisable import Serialisable

class ConditionalFormatting(Serialisable):
    tagname: str
    sqref: Any
    cells: Any
    pivot: Any
    cfRule: Any
    rules: Any
    def __init__(self, sqref=..., pivot: Any | None = ..., cfRule=..., extLst: Any | None = ...) -> None: ...
    def __eq__(self, other): ...
    def __hash__(self) -> int: ...
    def __contains__(self, coord): ...

class ConditionalFormattingList:
    max_priority: int
    def __init__(self) -> None: ...
    def add(self, range_string, cfRule) -> None: ...
    def __bool__(self) -> bool: ...
    def __len__(self) -> int: ...
    def __iter__(self): ...
    def __getitem__(self, key): ...
    def __delitem__(self, key) -> None: ...
    def __setitem__(self, key, rule) -> None: ...
