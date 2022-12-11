from collections.abc import Callable

from consolemenu.menu_formatter import MenuFormatBuilder as MenuFormatBuilder
from consolemenu.screen import Screen as Screen

class ConsoleMenu:
    currently_active_menu: ConsoleMenu | None
    screen: Screen
    clear_screen_before_render: bool
    formatter: MenuFormatBuilder
    title: str | Callable[[], str] | None
    subtitle: str | Callable[[], str] | None
    prologue_text: str | Callable[[], str] | None
    epilogue_text: str | Callable[[], str] | None
    highlight: None
    normal: None
    show_exit_option: bool
    items: list[MenuItem]
    parent: ConsoleMenu | None
    exit_item: ExitItem
    current_option: int
    selected_option: int
    returned_value: object | None
    should_exit: bool
    previous_active_menu: ConsoleMenu | None
    def __init__(
        self,
        title: str | Callable[[], str] | None = ...,
        subtitle: str | Callable[[], str] | None = ...,
        screen: Screen | None = ...,
        formatter: MenuFormatBuilder | None = ...,
        prologue_text: str | Callable[[], str] | None = ...,
        epilogue_text: str | Callable[[], str] | None = ...,
        clear_screen: bool = ...,
        show_exit_option: bool = ...,
        exit_option_text: str = ...,
    ) -> None: ...
    @property
    def current_item(self) -> MenuItem | None: ...
    @property
    def selected_item(self) -> MenuItem | None: ...
    def append_item(self, item: MenuItem) -> None: ...
    def remove_item(self, item: MenuItem) -> bool: ...
    def add_exit(self) -> bool: ...
    def remove_exit(self) -> bool: ...
    def is_selected_item_exit(self) -> bool: ...
    def start(self, show_exit_option: bool | None = ...) -> None: ...
    def show(self, show_exit_option: bool | None = ...) -> None: ...
    def draw(self) -> None: ...
    def is_running(self) -> bool: ...
    def wait_for_start(self, timeout: float | None = ...) -> bool: ...
    def is_alive(self) -> bool: ...
    def pause(self) -> None: ...
    def resume(self) -> None: ...
    def join(self, timeout: float | None = ...) -> None: ...
    def get_input(self) -> int: ...
    def process_user_input(self) -> int | None: ...
    def go_to(self, option: int) -> None: ...
    def go_down(self) -> None: ...
    def go_up(self) -> None: ...
    def select(self) -> None: ...
    def exit(self) -> None: ...
    def clear_screen(self) -> None: ...
    def get_title(self) -> str: ...
    def get_subtitle(self) -> str: ...
    def get_prologue_text(self) -> str: ...
    def get_epilogue_text(self) -> str: ...

class MenuItem:
    text: str
    menu: ConsoleMenu | None
    should_exit: bool
    index_item_separator: str
    def __init__(self, text: str | Callable[[], str], menu: ConsoleMenu | None = ..., should_exit: bool = ...) -> None: ...
    def show(self, index: int) -> str: ...
    def set_up(self) -> None: ...
    def action(self) -> None: ...
    def clean_up(self) -> None: ...
    def get_return(self) -> object: ...
    def __eq__(self, o: MenuItem) -> bool: ...  # type: ignore[override]
    def get_text(self) -> str: ...

class ExitItem(MenuItem):
    def __init__(self, text: str | Callable[[], str] = ..., menu: ConsoleMenu | None = ...) -> None: ...
    def show(self, index: int, available_width: None = ...) -> str: ...

def clear_terminal() -> None: ...
