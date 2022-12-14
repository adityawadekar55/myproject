from collections.abc import Callable, Container, Iterable, Mapping, Sequence
from typing import Any, NamedTuple
from typing_extensions import TypeAlias

__version__: str

LATEX_ESCAPE_RULES: dict[str, str]
MIN_PADDING: int
PRESERVE_WHITESPACE: bool
WIDE_CHARS_MODE: bool
multiline_formats: dict[str, str]
tabulate_formats: list[str]

class Line(NamedTuple):
    begin: str
    hline: str
    sep: str
    end: str

class DataRow(NamedTuple):
    begin: str
    sep: str
    end: str

_TableFormatLine: TypeAlias = None | Line | Callable[[list[int], list[str]], str]
_TableFormatRow: TypeAlias = None | DataRow | Callable[[list[Any], list[int], list[str]], str]

class TableFormat(NamedTuple):
    lineabove: _TableFormatLine
    linebelowheader: _TableFormatLine
    linebetweenrows: _TableFormatLine
    linebelow: _TableFormatLine
    headerrow: _TableFormatRow
    datarow: _TableFormatRow
    padding: int
    with_header_hide: Container[str] | None

def simple_separated_format(separator: str) -> TableFormat: ...
def tabulate(
    tabular_data: Mapping[str, Iterable[Any]] | Iterable[Iterable[Any]],
    headers: str | dict[str, str] | Sequence[str] = ...,
    tablefmt: str | TableFormat = ...,
    floatfmt: str | Iterable[str] = ...,
    intfmt: str | Iterable[str] = ...,
    numalign: str | None = ...,
    stralign: str | None = ...,
    missingval: str | Iterable[str] = ...,
    showindex: str | bool | Iterable[Any] = ...,
    disable_numparse: bool | Iterable[int] = ...,
    colalign: Iterable[str | None] | None = ...,
    maxcolwidths: int | Iterable[int | None] | None = ...,
    rowalign: str | Iterable[str] | None = ...,
    maxheadercolwidths: int | Iterable[int] | None = ...,
) -> str: ...
